package com.rbkmoney.fraudo.test.model;

import com.rbkmoney.fraudo.model.BaseModel;
import lombok.Data;

@Data
public class P2PModel extends BaseModel {

    private String bin;
    private String pan;
    private String country;
    private String cardTokenFrom;
    private String cardTokenTo;
    private String identityId;

}
