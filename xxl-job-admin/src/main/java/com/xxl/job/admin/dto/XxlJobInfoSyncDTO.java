package com.xxl.job.admin.dto;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class XxlJobInfoSyncDTO {
    private List<XxlJobInfoDTO> xxlJobInfoDTOs;
    private String fileName;

    public XxlJobInfoSyncDTO() {
    }

    public List<XxlJobInfoDTO> getXxlJobInfoDTOs() {
        return xxlJobInfoDTOs;
    }

    public void setXxlJobInfoDTOs(List<XxlJobInfoDTO> xxlJobInfoDTOs) {
        this.xxlJobInfoDTOs = xxlJobInfoDTOs;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
