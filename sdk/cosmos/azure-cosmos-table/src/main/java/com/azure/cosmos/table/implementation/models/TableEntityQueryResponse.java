// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.cosmos.table.implementation.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;
import java.util.Map;

/** The TableEntityQueryResponse model. */
@Fluent
public final class TableEntityQueryResponse {
    /*
     * The metadata response of the table.
     */
    @JsonProperty(value = "odata.metadata")
    private String odataMetadata;

    /*
     * List of table entities.
     */
    @JsonProperty(value = "value")
    private List<Map<String, Object>> value;

    /**
     * Get the odataMetadata property: The metadata response of the table.
     *
     * @return the odataMetadata value.
     */
    public String getOdataMetadata() {
        return this.odataMetadata;
    }

    /**
     * Set the odataMetadata property: The metadata response of the table.
     *
     * @param odataMetadata the odataMetadata value to set.
     * @return the TableEntityQueryResponse object itself.
     */
    public TableEntityQueryResponse setOdataMetadata(String odataMetadata) {
        this.odataMetadata = odataMetadata;
        return this;
    }

    /**
     * Get the value property: List of table entities.
     *
     * @return the value value.
     */
    public List<Map<String, Object>> getValue() {
        return this.value;
    }

    /**
     * Set the value property: List of table entities.
     *
     * @param value the value value to set.
     * @return the TableEntityQueryResponse object itself.
     */
    public TableEntityQueryResponse setValue(List<Map<String, Object>> value) {
        this.value = value;
        return this;
    }
}
