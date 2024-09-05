package com.crud.controller;

import com.crud.domain.model.ProcessoStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProcessoController {

    @GetMapping("/api/process/status/{processId}")
    public ProcessoStatus getProcessoStatus(@PathVariable Long processoId){

        ProcessoStatus status = new ProcessoStatus(processoId, "in_progress", 60);
        return status;
    }

}
