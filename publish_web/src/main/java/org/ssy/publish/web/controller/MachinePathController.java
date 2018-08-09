package org.ssy.publish.web.controller;

import java.lang.reflect.Field;
import java.util.ArrayList;
import javax.persistence.Column;
import org.springframework.util.ReflectionUtils;
import org.springframework.util.ReflectionUtils.FieldCallback;
import org.springframework.util.StringUtils;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.core.ResultGenerator;
import org.ssy.publish.web.model.MachinePath;
import org.ssy.publish.web.model.MachineServer;
import org.ssy.publish.web.service.MachinePathService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;
import org.ssy.publish.web.vo.TableColumn;

/**
 * Created by CodeGenerator on 2018/06/29.
 */
@RestController
@RequestMapping("/machine/path")
public class MachinePathController {

  @Resource
  private MachinePathService machinePathService;

  @PostMapping("/add")
  public Result add(MachinePath machinePath) {
    machinePathService.save(machinePath);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/delete")
  public Result delete(@RequestParam Integer id) {
    machinePathService.deleteById(id);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/update")
  public Result update(MachinePath machinePath) {
    machinePathService.update(machinePath);
    return ResultGenerator.genSuccessResult();
  }

  @PostMapping("/detail")
  public Result detail(@RequestParam Integer id) {
    MachinePath machinePath = machinePathService.findById(id);
    return ResultGenerator.genSuccessResult(machinePath);
  }

  @PostMapping("/list")
  public Result list(@RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "0") Integer size) {
    PageHelper.startPage(page, size);
    List<MachinePath> list = machinePathService.findAll();
    PageInfo pageInfo = new PageInfo(list);
    return ResultGenerator.genSuccessResult(pageInfo);
  }

  @PostMapping("/rows_json")
  public Object rows_json(@RequestParam(defaultValue = "0") Integer page,
      @RequestParam(defaultValue = "0") Integer size) {
    PageHelper.startPage(page, size);
    List<MachinePath> list = machinePathService.findAll();
    return list;
  }


  @PostMapping("/columns_json")
  public Object columns_json() {
    final List<TableColumn> list = new ArrayList<TableColumn>();
    ReflectionUtils.doWithFields(MachinePath.class, new FieldCallback() {
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



}
