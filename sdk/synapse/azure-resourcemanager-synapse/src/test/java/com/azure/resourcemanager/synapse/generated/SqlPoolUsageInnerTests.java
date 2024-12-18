// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.synapse.generated;

import com.azure.core.util.BinaryData;
import com.azure.resourcemanager.synapse.fluent.models.SqlPoolUsageInner;

public final class SqlPoolUsageInnerTests {
    @org.junit.jupiter.api.Test
    public void testDeserialize() throws Exception {
        SqlPoolUsageInner model = BinaryData.fromString(
            "{\"name\":\"gdknnqv\",\"resourceName\":\"znqntoru\",\"displayName\":\"gsahmkycgrauw\",\"currentValue\":35.149572223577785,\"limit\":27.237904606376194,\"unit\":\"ruvdmov\",\"nextResetTime\":\"2021-10-21T17:37:50Z\"}")
            .toObject(SqlPoolUsageInner.class);
    }

    @org.junit.jupiter.api.Test
    public void testSerialize() throws Exception {
        SqlPoolUsageInner model = new SqlPoolUsageInner();
        model = BinaryData.fromObject(model).toObject(SqlPoolUsageInner.class);
    }
}
