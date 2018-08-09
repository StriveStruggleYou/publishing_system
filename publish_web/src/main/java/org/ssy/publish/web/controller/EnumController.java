package org.ssy.publish.web.controller;


import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.ssy.publish.web.core.Result;
import org.ssy.publish.web.enums.InitMachineEnum;
import org.ssy.publish.web.vo.Select2Option;

@RestController
@RequestMapping("/enum/")
public class EnumController {

  @GetMapping("/listInitMachineEnum")
  public Result listInitMachineEnum() {
    Result result = new Result();
    List<Select2Option> optionList = new ArrayList<>();
    for (InitMachineEnum machineEnum : InitMachineEnum.values()) {
      Select2Option option = new Select2Option();
      option.setId(machineEnum.getCode());
      option.setText(machineEnum.getDesc());
      optionList.add(option);
    }
    result.setData(optionList);
    return result;
  }

}
