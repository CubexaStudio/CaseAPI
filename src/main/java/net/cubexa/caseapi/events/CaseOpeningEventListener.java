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

/**
 * Listener interface for handling CaseOpening related events.
 */
public interface CaseOpeningEventListener {

    /**
     * Called when a player attempts to open a case.
     * This event is cancelable. Cancelling it will prevent the case from opening.
     *
     * @param event The {@link CaseOpenEvent} instance.
     */
    void onCaseOpen(CaseOpenEvent event);

    /**
     * Called when a player has successfully completed opening a case.
     * This event is not cancelable.
     *
     * @param event The {@link CaseOpenCompleteEvent} instance.
     */
    void onCaseOpenComplete(CaseOpenCompleteEvent event);

    /**
     * Called when a player fails to open a case.
     * This event is not cancelable.
     *
     * @param event The {@link FailedCaseOpenEvent} instance.
     */
    void onFailedCaseOpen(FailedCaseOpenEvent event);

    /**
     * Called when a case reward announcement is about to be sent.
     * The announcement message can also be modified.
     * This event is cancelable. Cancelling it will prevent the announcement.
     *
     * @param event The {@link CaseRewardAnnounceEvent} instance.
     */
    void onCaseRewardAnnounce(CaseRewardAnnounceEvent event);
}