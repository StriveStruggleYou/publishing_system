package org.ssy.publish.web.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.persistence.Column;
import org.apache.commons.collections4.CollectionUtils;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.core.ResultGenerator;
import org.ssy.publish.web.model.MachineServer;
import org.ssy.publish.web.service.MachineServerService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import org.ssy.publish.web.vo.Select2Option;
import org.ssy.publish.web.vo.TableColumn;
import tk.mybatis.mapper.entity.Condition;

/**
 * Created by CodeGenerator on 2018/08/08.
 */
@RestController
@RequestMapping("/machine/server")
public class MachineServerController {

  @Resource
  private MachineServerService machineServerService;

  @PostMapping("/add")
  public Result add(MachineServer machineServer) {
    machineServerService.save(machineServer);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/delete")
  public Result delete(@RequestParam Integer id) {
    machineServerService.deleteById(id);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/update")
  public Result update(MachineServer machineServer) {
    machineServerService.update(machineServer);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/detail")
  public Result detail(@RequestParam Integer id) {
    MachineServer machineServer = machineServerService.findById(id);
    return ResultGenerator.genSuccessResult(machineServer);
  }

  @PostMapping("/list")
  public Result list(@RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "0") Integer size) {
    PageHelper.startPage(page, size);
    List<MachineServer> list = machineServerService.findAll();
    PageInfo pageInfo = new PageInfo(list);
    return ResultGenerator.genSuccessResult(pageInfo);
  }

  @PostMapping("columns_json")
  public Object columns_json() {
    final List<TableColumn> list = new ArrayList<TableColumn>();
    ReflectionUtils.doWithFields(MachineServer.class, new FieldCallback() {
      public void doWith(Field field) throws IllegalArgumentException,
          IllegalAccessException {
        TableColumn tableColumn = new TableColumn();
        Column columnAnntation = (Column) field.getAnnotation(Column.class);
        if (columnAnntation == null) {
          tableColumn.setName(field.getName());
          tableColumn.setTitle(field.getName());
        } else {
          tableColumn.setName(field.getName());
          if (StringUtils.isEmpty(columnAnntation.columnDefinition())) {
            tableColumn.setTitle(field.getName());
          } else {
            tableColumn.setTitle(columnAnntation.columnDefinition());
          }
        }
        list.add(tableColumn);
      }
    });
    return list;
  }

  @PostMapping("init_machine")
  public Result init() {
    Result result = new Result();
    return result;
  }


  @GetMapping("/query")
  public Result query(@RequestParam(defaultValue = "1") Long clusterId) {
    Result result = new Result();
    List<Select2Option> optionList = new ArrayList<>();
    Condition condition = new Condition(MachineServer.class);
    condition.and().andEqualTo("msClusterId", clusterId);
    List<MachineServer> msList = machineServerService
        .findByCondition(condition);
    if (CollectionUtils.isNotEmpty(msList)) {
      for (MachineServer machineServer : msList) {
        Select2Option select2Option = new Select2Option();
        select2Option.setId(machineServer.getId());
        select2Option.setText(machineServer.getMsName());
        optionList.add(select2Option);
      }
    }
    result.setData(optionList);
    return result;
  }

}
