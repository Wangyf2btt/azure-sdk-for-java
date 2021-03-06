// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
// Code generated by Microsoft (R) AutoRest Code Generator.

package com.azure.resourcemanager.sql.fluent;

import com.azure.core.annotation.ReturnType;
import com.azure.core.annotation.ServiceMethod;
import com.azure.core.http.rest.PagedFlux;
import com.azure.core.http.rest.PagedIterable;
import com.azure.core.http.rest.Response;
import com.azure.core.management.polling.PollResult;
import com.azure.core.util.Context;
import com.azure.core.util.polling.PollerFlux;
import com.azure.core.util.polling.SyncPoller;
import com.azure.resourcemanager.sql.fluent.models.SyncAgentInner;
import com.azure.resourcemanager.sql.fluent.models.SyncAgentKeyPropertiesInner;
import com.azure.resourcemanager.sql.fluent.models.SyncAgentLinkedDatabaseInner;
import java.nio.ByteBuffer;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/** An instance of this class provides access to all the operations defined in SyncAgentsClient. */
public interface SyncAgentsClient {
    /**
     * Gets a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SyncAgentInner>> getWithResponseAsync(
        String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Gets a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SyncAgentInner> getAsync(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Gets a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncAgentInner get(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Gets a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SyncAgentInner> getWithResponse(
        String resourceGroupName, String serverName, String syncAgentName, Context context);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> createOrUpdateWithResponseAsync(
        String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<SyncAgentInner>, SyncAgentInner> beginCreateOrUpdateAsync(
        String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SyncAgentInner>, SyncAgentInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<SyncAgentInner>, SyncAgentInner> beginCreateOrUpdate(
        String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId, Context context);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SyncAgentInner> createOrUpdateAsync(
        String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SyncAgentInner> createOrUpdateAsync(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncAgentInner createOrUpdate(
        String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param syncDatabaseId ARM resource id of the sync database in the sync agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncAgentInner createOrUpdate(
        String resourceGroupName, String serverName, String syncAgentName, String syncDatabaseId, Context context);

    /**
     * Creates or updates a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return an Azure SQL Database sync agent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncAgentInner createOrUpdate(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Deletes a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<Flux<ByteBuffer>>> deleteWithResponseAsync(
        String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Deletes a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    PollerFlux<PollResult<Void>, Void> beginDeleteAsync(
        String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Deletes a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Deletes a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncPoller<PollResult<Void>, Void> beginDelete(
        String resourceGroupName, String serverName, String syncAgentName, Context context);

    /**
     * Deletes a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return the completion.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Void> deleteAsync(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Deletes a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Deletes a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    void delete(String resourceGroupName, String serverName, String syncAgentName, Context context);

    /**
     * Lists sync agents in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sync agents.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SyncAgentInner> listByServerAsync(String resourceGroupName, String serverName);

    /**
     * Lists sync agents in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sync agents.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncAgentInner> listByServer(String resourceGroupName, String serverName);

    /**
     * Lists sync agents in a server.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sync agents.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncAgentInner> listByServer(String resourceGroupName, String serverName, Context context);

    /**
     * Generates a sync agent key.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an Azure SQL Database sync agent key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<Response<SyncAgentKeyPropertiesInner>> generateKeyWithResponseAsync(
        String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Generates a sync agent key.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an Azure SQL Database sync agent key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Mono<SyncAgentKeyPropertiesInner> generateKeyAsync(
        String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Generates a sync agent key.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an Azure SQL Database sync agent key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    SyncAgentKeyPropertiesInner generateKey(String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Generates a sync agent key.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return properties of an Azure SQL Database sync agent key.
     */
    @ServiceMethod(returns = ReturnType.SINGLE)
    Response<SyncAgentKeyPropertiesInner> generateKeyWithResponse(
        String resourceGroupName, String serverName, String syncAgentName, Context context);

    /**
     * Lists databases linked to a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sync agent linked databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedFlux<SyncAgentLinkedDatabaseInner> listLinkedDatabasesAsync(
        String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Lists databases linked to a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sync agent linked databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncAgentLinkedDatabaseInner> listLinkedDatabases(
        String resourceGroupName, String serverName, String syncAgentName);

    /**
     * Lists databases linked to a sync agent.
     *
     * @param resourceGroupName The name of the resource group that contains the resource. You can obtain this value
     *     from the Azure Resource Manager API or the portal.
     * @param serverName The name of the server on which the sync agent is hosted.
     * @param syncAgentName The name of the sync agent.
     * @param context The context to associate with this operation.
     * @throws IllegalArgumentException thrown if parameters fail the validation.
     * @throws com.azure.core.management.exception.ManagementException thrown if the request is rejected by server.
     * @throws RuntimeException all other wrapped checked exceptions if the request fails to be sent.
     * @return a list of sync agent linked databases.
     */
    @ServiceMethod(returns = ReturnType.COLLECTION)
    PagedIterable<SyncAgentLinkedDatabaseInner> listLinkedDatabases(
        String resourceGroupName, String serverName, String syncAgentName, Context context);
}
