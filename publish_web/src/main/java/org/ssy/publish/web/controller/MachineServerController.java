package org.ssy.publish.web.web;
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

/**
* Created by CodeGenerator on 2018/06/28.
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
    public Result list(@RequestParam(defaultValue = "0") Integer page, @RequestParam(defaultValue = "0") Integer size) {
        PageHelper.startPage(page, size);
        List<MachineServer> list = machineServerService.findAll();
        PageInfo pageInfo = new PageInfo(list);
        return ResultGenerator.genSuccessResult(pageInfo);
    }
}
