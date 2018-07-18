package com.example.cardatastorage;

import java.util.Date;

public class CarDataModel {
    private Date currentDate;
    private String modelNo;
    private String vinNo;
    private String typeOfWork;
    private String problem;
    private String reason;
    private String removedPart;
    private String releasedPart;
    private float torque;
    private String repairMan;
    private String informationSource;
    private String responsible;

    public CarDataModel(String vinNo, String modelNo, String typeOfWork, String problem, String reason, String removedPart, String releasedPart, float torque, String repairMan, String informationSource, String responsible) {
        currentDate=new Date();
        this.modelNo = modelNo;
        this.vinNo = vinNo;
        this.typeOfWork = typeOfWork;
        this.problem = problem;
        this.reason = reason;
        this.removedPart = removedPart;
        this.releasedPart = releasedPart;
        this.torque = torque;
        this.repairMan = repairMan;
        this.informationSource = informationSource;
        this.responsible = responsible;
    }

    public String getModelNo() {
        return modelNo;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public String getVinNo() {
        return vinNo;
    }

    public String getTypeOfWork() {
        return typeOfWork;
    }

    public String getProblem() {
        return problem;
    }

    public String getReason() {
        return reason;
    }

    public String getRemovedPart() {
        return removedPart;
    }

    public String getReleasedPart() {
        return releasedPart;
    }

    public float getTorque() {
        return torque;
    }

    public String getRepairMan() {
        return repairMan;
    }

    public String getInformationSource() {
        return informationSource;
    }

    public String getResponsible() {
        return responsible;
    }

    public long getTime(){
        return currentDate.getTime();
    }
}
