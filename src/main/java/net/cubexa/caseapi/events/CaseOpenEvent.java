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
 * Event fired when a player attempts to open a case.
 * <p>
 * The event is cancelable. Cancelling the event will prevent the case from being opened.
 */
public class CaseOpenEvent {

    private final UUID playerUuid;
    private final Case crate;
    private boolean isCancelled;

    /**
     * Constructs a new {@code CaseOpenEvent}.
     *
     * @param playerUuid The UUID of the player who attempts to open the case.
     * @param crate The {@link Case} the player is trying to open.
     */
    public CaseOpenEvent(UUID playerUuid, Case crate) {
        this.playerUuid = playerUuid;
        this.crate = crate;
        this.isCancelled = false;
    }

    /**
     * Gets the UUID of the player who attempts to open the case.
     *
     * @return The player's UUID.
     */
    public UUID getPlayerUuid() {
        return playerUuid;
    }

    /**
     * Gets the {@link Case} the player is trying to open.
     *
     * @return The {@link Case} instance.
     */
    public Case getCase() {
        return crate;
    }

    /**
     * Checks if the event has been cancelled.
     *
     * @return {@code true} if the event is cancelled; {@code false} otherwise.
     */
    public boolean isCancelled() {
        return isCancelled;
    }

    /**
     * Sets the cancellation state of the event.
     *
     * @param cancelled {@code true} to cancel the event and prevent the case from opening; {@code false} to allow it.
     */
    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }
}