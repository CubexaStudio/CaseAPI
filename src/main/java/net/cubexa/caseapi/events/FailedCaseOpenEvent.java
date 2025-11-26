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
package net.cubexa.caseapi.events;

import net.cubexa.caseapi.models.Case;

import java.util.UUID;

/**
 * Event fired when a player fails to open a case.
 * <p>
 * This event is not cancelable and serves only as a notification.
 */
public class FailedCaseOpenEvent {

    private final UUID playerUuid;
    private final Case crate;

    /**
     * Constructs a new {@code FailedCaseOpenEvent}.
     *
     * @param playerUuid The UUID of the player who failed to open the case.
     * @param crate The {@link Case} the player attempted to open.
     */
    public FailedCaseOpenEvent(UUID playerUuid, Case crate) {
        this.playerUuid = playerUuid;
        this.crate = crate;
    }

    /**
     * Gets the UUID of the player who failed to open the case.
     *
     * @return The player's UUID.
     */
    public UUID getPlayerUuid() {
        return playerUuid;
    }

    /**
     * Gets the {@link Case} the player attempted to open.
     *
     * @return The {@link Case} instance.
     */
    public Case getCase() {
        return crate;
    }
}