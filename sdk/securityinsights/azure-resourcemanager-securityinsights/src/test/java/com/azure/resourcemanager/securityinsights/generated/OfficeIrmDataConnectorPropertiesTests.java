// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.securityinsights.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.securityinsights.fluent.models.OfficeIrmDataConnectorProperties;
import com.azure.resourcemanager.securityinsights.models.AlertsDataTypeOfDataConnector;
import com.azure.resourcemanager.securityinsights.models.DataConnectorDataTypeCommon;
import com.azure.resourcemanager.securityinsights.models.DataTypeState;
import org.junit.jupiter.api.Assertions;

public final class OfficeIrmDataConnectorPropertiesTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        OfficeIrmDataConnectorProperties model
            = BinaryData.fromString("{\"dataTypes\":{\"alerts\":{\"state\":\"Enabled\"}},\"tenantId\":\"bn\"}")
                .toObject(OfficeIrmDataConnectorProperties.class);
        Assertions.assertEquals("bn", model.tenantId());
        Assertions.assertEquals(DataTypeState.ENABLED, model.dataTypes().alerts().state());
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        OfficeIrmDataConnectorProperties model = new OfficeIrmDataConnectorProperties().withTenantId("bn")
            .withDataTypes(new AlertsDataTypeOfDataConnector()
                .withAlerts(new DataConnectorDataTypeCommon().withState(DataTypeState.ENABLED)));
        model = BinaryData.fromObject(model).toObject(OfficeIrmDataConnectorProperties.class);
        Assertions.assertEquals("bn", model.tenantId());
        Assertions.assertEquals(DataTypeState.ENABLED, model.dataTypes().alerts().state());
    }
}
