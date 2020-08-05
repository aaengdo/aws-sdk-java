/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.transcribe.model.transform;

import javax.annotation.Generated;

import com.amazonaws.SdkClientException;
import com.amazonaws.services.transcribe.model.*;

import com.amazonaws.protocol.*;
import com.amazonaws.annotation.SdkInternalApi;

/**
 * CreateLanguageModelRequestMarshaller
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
@SdkInternalApi
public class CreateLanguageModelRequestMarshaller {

    private static final MarshallingInfo<String> LANGUAGECODE_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("LanguageCode").build();
    private static final MarshallingInfo<String> BASEMODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("BaseModelName").build();
    private static final MarshallingInfo<String> MODELNAME_BINDING = MarshallingInfo.builder(MarshallingType.STRING).marshallLocation(MarshallLocation.PAYLOAD)
            .marshallLocationName("ModelName").build();
    private static final MarshallingInfo<StructuredPojo> INPUTDATACONFIG_BINDING = MarshallingInfo.builder(MarshallingType.STRUCTURED)
            .marshallLocation(MarshallLocation.PAYLOAD).marshallLocationName("InputDataConfig").build();

    private static final CreateLanguageModelRequestMarshaller instance = new CreateLanguageModelRequestMarshaller();

    public static CreateLanguageModelRequestMarshaller getInstance() {
        return instance;
    }

    /**
     * Marshall the given parameter object.
     */
    public void marshall(CreateLanguageModelRequest createLanguageModelRequest, ProtocolMarshaller protocolMarshaller) {

        if (createLanguageModelRequest == null) {
            throw new SdkClientException("Invalid argument passed to marshall(...)");
        }

        try {
            protocolMarshaller.marshall(createLanguageModelRequest.getLanguageCode(), LANGUAGECODE_BINDING);
            protocolMarshaller.marshall(createLanguageModelRequest.getBaseModelName(), BASEMODELNAME_BINDING);
            protocolMarshaller.marshall(createLanguageModelRequest.getModelName(), MODELNAME_BINDING);
            protocolMarshaller.marshall(createLanguageModelRequest.getInputDataConfig(), INPUTDATACONFIG_BINDING);
        } catch (Exception e) {
            throw new SdkClientException("Unable to marshall request to JSON: " + e.getMessage(), e);
        }
    }

}
