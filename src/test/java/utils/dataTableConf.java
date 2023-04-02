package utils;

import io.cucumber.java.DataTableType;
import models.model_DataTicket;

import java.util.Map;

public class dataTableConf {

    @DataTableType
    public model_DataTicket dataUsers (Map<String,String>infoUsers) throws Throwable{
        return new model_DataTicket(
               infoUsers.get("fecha"),
               infoUsers.get("dias"),
               infoUsers.get("adultos"),
               infoUsers.get("ninos")
        );
    }
}
