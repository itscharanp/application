package com.charan.springboot.CustomerLog.rest;

import com.charan.springboot.CustomerLog.dao.LogmodelDAO;
import com.charan.springboot.CustomerLog.entity.Logmodel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.List;


@RestController
@RequestMapping("/api")
public class LogmodelRestController {
    private
    LogmodelDAO logmodelDAO;
    @Autowired
    public LogmodelRestController(LogmodelDAO theLogmodelDAO) {
        logmodelDAO=theLogmodelDAO;
    }
    @GetMapping("/getAllLog")
    public List<Logmodel> findAll(){
        return logmodelDAO.findAll();
    }
    @GetMapping("/checkIn")
    public void getEntryIn(@RequestParam String peru) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        String date="";
        date=date+localDate;
        String time="";
        time=time+localTime;
        String idee="";
        idee=idee+peru+" "+time;
        String name=peru;
        Logmodel lm=new Logmodel(name,"IN",date,time);
        lm.setId(idee);
        logmodelDAO.saveit(lm);

    }
    @GetMapping("/checkOut")
    public void getEntryOut(@RequestParam String name) {
        LocalTime localTime = LocalTime.now();
        LocalDate localDate = LocalDate.now();
        String date="";
        date=date+localDate;
        String time="";
        time=time+localTime;
        String idd="";
        idd=idd+name+" "+time;
        Logmodel lm=new Logmodel(name,"OUT",date,time);
        lm.setId(idd);
        logmodelDAO.saveit(lm);
    }
    @GetMapping("/getLog")
    public List<Logmodel> getDatEntry(@RequestParam String date) {

        return logmodelDAO.findByDate(date);

    }
}
