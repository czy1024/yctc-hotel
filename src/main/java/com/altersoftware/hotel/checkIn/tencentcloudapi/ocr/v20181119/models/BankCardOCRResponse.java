/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.altersoftware.hotel.checkIn.tencentcloudapi.ocr.v20181119.models;

import java.util.HashMap;

import com.altersoftware.hotel.checkIn.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class BankCardOCRResponse extends AbstractModel {

    /**
     * 卡号
     */
    @SerializedName("CardNo")
    @Expose
    private String CardNo;

    /**
     * 银行信息
     */
    @SerializedName("BankInfo")
    @Expose
    private String BankInfo;

    /**
     * 有效期
     */
    @SerializedName("ValidDate")
    @Expose
    private String ValidDate;

    /**
     * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 卡号
     *
     * @return CardNo 卡号
     */
    public String getCardNo() {
        return this.CardNo;
    }

    /**
     * Set 卡号
     *
     * @param CardNo 卡号
     */
    public void setCardNo(String CardNo) {
        this.CardNo = CardNo;
    }

    /**
     * Get 银行信息
     *
     * @return BankInfo 银行信息
     */
    public String getBankInfo() {
        return this.BankInfo;
    }

    /**
     * Set 银行信息
     *
     * @param BankInfo 银行信息
     */
    public void setBankInfo(String BankInfo) {
        this.BankInfo = BankInfo;
    }

    /**
     * Get 有效期
     *
     * @return ValidDate 有效期
     */
    public String getValidDate() {
        return this.ValidDate;
    }

    /**
     * Set 有效期
     *
     * @param ValidDate 有效期
     */
    public void setValidDate(String ValidDate) {
        this.ValidDate = ValidDate;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     *
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CardNo", this.CardNo);
        this.setParamSimple(map, prefix + "BankInfo", this.BankInfo);
        this.setParamSimple(map, prefix + "ValidDate", this.ValidDate);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}