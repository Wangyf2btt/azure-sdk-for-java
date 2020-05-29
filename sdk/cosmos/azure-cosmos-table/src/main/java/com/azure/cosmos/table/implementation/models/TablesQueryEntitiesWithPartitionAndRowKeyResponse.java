// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cosmos.table.implementation.models;

import com.azure.core.http.HttpHeaders;
import com.azure.core.http.HttpRequest;
import com.azure.core.http.rest.ResponseBase;

/** Contains all response data for the queryEntitiesWithPartitionAndRowKey operation. */
public final class TablesQueryEntitiesWithPartitionAndRowKeyResponse
        extends ResponseBase<TablesQueryEntitiesWithPartitionAndRowKeyHeaders, TableEntityQueryResponse> {
    /**
     * Creates an instance of TablesQueryEntitiesWithPartitionAndRowKeyResponse.
     *
     * @param request the request which resulted in this TablesQueryEntitiesWithPartitionAndRowKeyResponse.
     * @param statusCode the status code of the HTTP response.
     * @param rawHeaders the raw headers of the HTTP response.
     * @param value the deserialized value of the HTTP response.
     * @param headers the deserialized headers of the HTTP response.
     */
    public TablesQueryEntitiesWithPartitionAndRowKeyResponse(
            HttpRequest request,
            int statusCode,
            HttpHeaders rawHeaders,
            TableEntityQueryResponse value,
            TablesQueryEntitiesWithPartitionAndRowKeyHeaders headers) {
        super(request, statusCode, rawHeaders, value, headers);
    }

    /** @return the deserialized response body. */
    @Override
    public TableEntityQueryResponse getValue() {
        return super.getValue();
    }
}
