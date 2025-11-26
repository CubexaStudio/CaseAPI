/*
 * CaseAPI, a Minecraft plugin API by Cubexa Studio
 * Copyright (C) 2025 Cubexa Studio <https://cubexa.net>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */
package net.cubexa.caseapi;

import net.cubexa.caseapi.events.CaseOpeningEventListener;

import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * The {@code CaseAPI} interface provides access to all core CaseOpening functionalities.
 * <p>
 * It allows interaction with cases, jewelry, and global statistics, as well as registering
 * event listeners for case-related actions.
 * <p>
 * This interface should <b>not</b> be implemented manually. It is implemented internally
 * by the CaseOpening system.
 */
public interface CaseAPI {

    /**
     * Checks whether a case with the given ID exists.
     *
     * @param caseId The ID of the case to check.
     * @return A {@link CompletableFuture} that completes with {@code true} if the case exists; {@code false} otherwise.
     */
    CompletableFuture<Boolean> caseExists(String caseId);

    /**
     * Opens a case for the specified player and removes one instance of it from their cases.
     *
     * @param playerUuid The UUID of the player opening the case.
     * @param caseId The ID of the case to open.
     * @return A {@link CompletableFuture} that completes with {@code true} if the case was opened successfully; {@code false} otherwise.
     */
    CompletableFuture<Boolean> openCaseWithRemove(UUID playerUuid, String caseId);

    /**
     * Opens a case for the specified player without removing it from their cases.
     *
     * @param playerUuid The UUID of the player opening the case.
     * @param caseId The ID of the case to open.
     * @return A {@link CompletableFuture} that completes with {@code true} if the case was opened successfully; {@code false} otherwise.
     */
    CompletableFuture<Boolean> openCaseWithoutRemove(UUID playerUuid, String caseId);

    /**
     * Opens a case preview for the specified player.
     *
     * @param playerUuid The UUID of the player who will see the preview.
     * @param caseId The ID of the case to preview.
     */
    void openCasePreview(UUID playerUuid, String caseId);

    /**
     * Sets the amount of jewelry a player owns.
     *
     * @param playerUuid The UUID of the player whose jewelry amount will be set.
     * @param amount The new amount of jewelry.
     */
    void setJewelry(UUID playerUuid, int amount);

    /**
     * Adds the specified amount of jewelry to the given player.
     *
     * @param playerUuid The UUID of the player receiving the jewelry.
     * @param amount The amount of jewelry to add.
     */
    void addJewelry(UUID playerUuid, int amount);

    /**
     * Removes the specified amount of jewelry from the given player.
     *
     * @param playerUuid The UUID of the player whose jewelry will be removed.
     * @param amount The amount of jewelry to remove.
     */
    void removeJewelry(UUID playerUuid, int amount);

    /**
     * Sets the amount of a specific case a player owns.
     *
     * @param playerUuid The UUID of the player whose cases will be set.
     * @param caseId The ID of the case to set.
     * @param amount The new amount of that case.
     */
    void setCases(UUID playerUuid, String caseId, int amount);

    /**
     * Adds the specified number of cases to the given player.
     *
     * @param playerUuid The UUID of the player receiving the cases.
     * @param caseId The ID of the case to add.
     * @param amount The number of cases to add.
     */
    void addCases(UUID playerUuid, String caseId, int amount);

    /**
     * Removes the specified number of cases from the given player.
     *
     * @param playerUuid The UUID of the player losing the cases.
     * @param caseId The ID of the case to remove.
     * @param amount The number of cases to remove.
     */
    void removeCases(UUID playerUuid, String caseId, int amount);

    /**
     * Retrieves the current amount of jewelry owned by the specified player.
     *
     * @param playerUuid The UUID of the player whose jewelry amount is requested.
     * @return A {@link CompletableFuture} that completes with the player's current jewelry amount.
     */
    CompletableFuture<Integer> getJewelry(UUID playerUuid);

    /**
     * Retrieves the number of a specific case a player owns.
     *
     * @param playerUuid The UUID of the player whose case count is retrieved.
     * @param caseId The ID of the case.
     * @return A {@link CompletableFuture} that completes with the number of cases the player owns.
     */
    CompletableFuture<Integer> getPlayerCases(UUID playerUuid, String caseId);

    /**
     * Retrieves the total number of cases opened globally.
     *
     * @return A {@link CompletableFuture} that completes with the total number of opened cases.
     */
    CompletableFuture<Integer> getTotalCasesOpened();

    /**
     * Retrieves the total number of cases opened by the specified player.
     *
     * @param playerUuid The UUID of the player whose case opening count is retrieved.
     * @return A {@link CompletableFuture} that completes with the total number of cases opened by the player.
     */
    CompletableFuture<Integer> getTotalCasesOpenedByPlayer(UUID playerUuid);

    /**
     * Registers a {@link CaseOpeningEventListener} to receive CaseAPI events.
     * <p>
     * If multiple listeners are registered, the last one added has the highest priority
     * and is called last, allowing it to react after others.
     *
     * @param listener The {@link CaseOpeningEventListener} to register.
     */
    void registerListener(CaseOpeningEventListener listener);

    /**
     * Unregisters a previously registered {@link CaseOpeningEventListener}, preventing it from receiving further events.
     *
     * @param listener The {@link CaseOpeningEventListener} to unregister.
     */
    void unregisterListener(CaseOpeningEventListener listener);
}