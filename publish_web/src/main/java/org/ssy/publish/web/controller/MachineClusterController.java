package org.ssy.publish.web.controller;
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
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "20") Integer size) {
        PageHelper.startPage(page, size);
        List<MachineCluster> list = machineClusterService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
