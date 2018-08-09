package org.ssy.publish.web.controller;

import com.google.common.collect.Maps;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.core.ResultGenerator;
import org.ssy.publish.web.model.MachineCluster;
import org.ssy.publish.web.service.MachineClusterService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import org.ssy.publish.web.vo.Select2Option;

/**
 * Created by CodeGenerator on 2018/08/07.
 */
@RestController
@RequestMapping("/machine/cluster")
public class MachineClusterController {

  @Resource
  private MachineClusterService machineClusterService;

  @PostMapping("/add")
  public Result add(MachineCluster machineCluster) {
    machineClusterService.save(machineCluster);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/delete")
  public Result delete(@RequestParam Integer id) {
    machineClusterService.deleteById(id);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/update")
  public Result update(MachineCluster machineCluster) {
    machineClusterService.update(machineCluster);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/detail")
  public Result detail(@RequestParam Integer id) {
    MachineCluster machineCluster = machineClusterService.findById(id);
    return ResultGenerator.genSuccessResult(machineCluster);
  }

  @GetMapping("/list")
  public Result list(@RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "20") Integer size) {
    PageHelper.startPage(page, size);
    List<MachineCluster> list = machineClusterService.findAll();
    PageInfo pageInfo = new PageInfo(list);
    return ResultGenerator.genSuccessResult(pageInfo);
  }

  @GetMapping("/query")
  public Map query() {

    List<MachineCluster> list = machineClusterService.findAll();

    List<Select2Option> results = new ArrayList<>();
//    Map result = new HashMap();
//    result.put("id", 1);
//    result.put("text", "Option 1");
//    results.add(result);
    //如何集合不为空
    if (CollectionUtils.isNotEmpty(list)) {
      for (MachineCluster cluster : list) {
        //设置集群相关信息
        Select2Option select2Option = new Select2Option();
        select2Option.setId(cluster.getId());
        select2Option.setText(cluster.getClusterName());
        results.add(select2Option);
      }
    }

//    result = new HashMap();
//    result.put("id", 2);
//    result.put("text", "Option 2");
//    results.add(result);

    Map pagination = new HashMap();
    pagination.put("more", true);

    Map map = new HashMap();
    map.put("results", results);
    map.put("pagination", pagination);
    return map;
  }


}
