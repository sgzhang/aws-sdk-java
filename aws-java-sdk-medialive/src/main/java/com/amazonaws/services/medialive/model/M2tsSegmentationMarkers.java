/*
 * Copyright 2013-2018 Amazon.com, Inc. or its affiliates. All Rights Reserved.
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
package com.amazonaws.services.medialive.model;

import javax.annotation.Generated;

/**
 * Placeholder documentation for M2tsSegmentationMarkers
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public enum M2tsSegmentationMarkers {

    EBP("EBP"),
    EBP_LEGACY("EBP_LEGACY"),
    NONE("NONE"),
    PSI_SEGSTART("PSI_SEGSTART"),
    RAI_ADAPT("RAI_ADAPT"),
    RAI_SEGSTART("RAI_SEGSTART");

    private String value;

    private M2tsSegmentationMarkers(String value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return this.value;
    }

    /**
     * Use this in place of valueOf.
     *
     * @param value
     *        real value
     * @return M2tsSegmentationMarkers corresponding to the value
     *
     * @throws IllegalArgumentException
     *         If the specified value does not map to one of the known values in this enum.
     */
    public static M2tsSegmentationMarkers fromValue(String value) {
        if (value == null || "".equals(value)) {
            throw new IllegalArgumentException("Value cannot be null or empty!");
        }

        for (M2tsSegmentationMarkers enumEntry : M2tsSegmentationMarkers.values()) {
            if (enumEntry.toString().equals(value)) {
                return enumEntry;
            }
        }

        throw new IllegalArgumentException("Cannot create enum from " + value + " value!");
    }
}
