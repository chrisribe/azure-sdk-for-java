// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.batchai.models;

import com.azure.core.annotation.Fluent;
import com.azure.core.util.logging.ClientLogger;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

/** Job preparation settings. */
@Fluent
public final class JobPreparation {
    @JsonIgnore
    private final ClientLogger logger = new ClientLogger(JobPreparation.class);

    /*
     * The command line to execute. If containerSettings is specified on the
     * job, this commandLine will be executed in the same container as job.
     * Otherwise it will be executed on the node.
     */
    @JsonProperty(value = "commandLine", required = true)
    private String commandLine;

    /**
     * Get the commandLine property: The command line to execute. If containerSettings is specified on the job, this
     * commandLine will be executed in the same container as job. Otherwise it will be executed on the node.
     *
     * @return the commandLine value.
     */
    public String commandLine() {
        return this.commandLine;
    }

    /**
     * Set the commandLine property: The command line to execute. If containerSettings is specified on the job, this
     * commandLine will be executed in the same container as job. Otherwise it will be executed on the node.
     *
     * @param commandLine the commandLine value to set.
     * @return the JobPreparation object itself.
     */
    public JobPreparation withCommandLine(String commandLine) {
        this.commandLine = commandLine;
        return this;
    }

    /**
     * Validates the instance.
     *
     * @throws IllegalArgumentException thrown if the instance is not valid.
     */
    public void validate() {
        if (commandLine() == null) {
            throw logger.logExceptionAsError(
                new IllegalArgumentException("Missing required property commandLine in model JobPreparation"));
        }
    }
}
