// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.videoanalyzer.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.util.Context;
import com.azure.resourcemanager.videoanalyzer.fluent.models.AccessPolicyEntityInner;

/** An instance of this class provides access to all the operations defined in AccessPoliciesClient. */
public interface AccessPoliciesClient {
    /**
     * Retrieves all existing access policy resources, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AccessPolicyEntity items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessPolicyEntityInner> list(String resourceGroupName, String accountName);

    /**
     * Retrieves all existing access policy resources, along with their JSON representations.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param top Specifies a non-negative integer n that limits the number of items returned from a collection. The
     *     service returns the number of available items up to but not greater than the specified value n.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a collection of AccessPolicyEntity items as paginated response with {@link PagedIterable}.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<AccessPolicyEntityInner> list(String resourceGroupName, String accountName, Integer top,
        Context context);

    /**
     * Retrieves an existing access policy resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access policies help define the authentication rules, and control access to specific video resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessPolicyEntityInner get(String resourceGroupName, String accountName, String accessPolicyName);

    /**
     * Retrieves an existing access policy resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access policies help define the authentication rules, and control access to specific video resources
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessPolicyEntityInner> getWithResponse(String resourceGroupName, String accountName,
        String accessPolicyName, Context context);

    /**
     * Creates a new access policy resource or updates an existing one with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access policies help define the authentication rules, and control access to specific video resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessPolicyEntityInner createOrUpdate(String resourceGroupName, String accountName, String accessPolicyName,
        AccessPolicyEntityInner parameters);

    /**
     * Creates a new access policy resource or updates an existing one with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access policies help define the authentication rules, and control access to specific video resources
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessPolicyEntityInner> createOrUpdateWithResponse(String resourceGroupName, String accountName,
        String accessPolicyName, AccessPolicyEntityInner parameters, Context context);

    /**
     * Deletes an existing access policy resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String accountName, String accessPolicyName);

    /**
     * Deletes an existing access policy resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<Void> deleteWithResponse(String resourceGroupName, String accountName, String accessPolicyName,
        Context context);

    /**
     * Updates individual properties of an existing access policy resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @param parameters The request parameters.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access policies help define the authentication rules, and control access to specific video resources.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    AccessPolicyEntityInner update(String resourceGroupName, String accountName, String accessPolicyName,
        AccessPolicyEntityInner parameters);

    /**
     * Updates individual properties of an existing access policy resource with the given name.
     *
     * @param resourceGroupName The name of the resource group. The name is case insensitive.
     * @param accountName The Azure Video Analyzer account name.
     * @param accessPolicyName The Access Policy name.
     * @param parameters The request parameters.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return access policies help define the authentication rules, and control access to specific video resources
     *     along with {@link Response}.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<AccessPolicyEntityInner> updateWithResponse(String resourceGroupName, String accountName,
        String accessPolicyName, AccessPolicyEntityInner parameters, Context context);
}
