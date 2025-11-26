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
package net.cubexa.caseapi.models;

/**
 * Represents a case that can be opened in the CaseOpening plugin with identification,
 * display, price, visual appearance, and permissions.
 */
public interface Case {

    /**
     * Returns the unique identifier of the case.
     *
     * @return The unique case ID.
     */
    String getCaseId();

    /**
     * Returns the display name of the case.
     *
     * @return The name displayed to players.
     */
    String getDisplayName();

    /**
     * Returns the serialized representation of the case's item stack in Base64 encoding.
     * <p>
     * This representation can be used to recreate the item stack visually in inventories
     * or GUIs.
     *
     * @return The Base64-encoded item stack.
     */
    String getItemStackBase64();

    /**
     * Returns the original price specified when the case was created.
     * <p>
     * This price applies to the specific case only and is used for direct case purchases.
     * Adjustments in configuration files do not change the value.
     *
     * @return The original creation price of the case.
     */
    int getPrice();

    /**
     * Checks whether the case should have a glowing visual effect.
     *
     * @return {@code true} if the case has a glowing effect; {@code false} otherwise.
     */
    boolean isWithGlowing();

    /**
     * Returns the permission required for a player to interact with the case.
     * <p>
     * Players without the permission should not be able to open or interact with the case.
     *
     * @return The permission required for a player.
     */
    String getPermission();
}