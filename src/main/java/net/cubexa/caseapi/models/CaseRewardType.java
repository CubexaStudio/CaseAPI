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
 * Defines the different types of rewards that a case can provide.
 */
public enum CaseRewardType {

    ITEM,
    GEMS,
    MONEY,
    COMMAND,
    PERMISSION;

    /**
     * Converts a string to its corresponding {@link CaseRewardType} enum value.
     * The string is case-insensitive.
     * <p>
     * If the string does not match any enum value, {@code null} is returned.
     *
     * @param s The string to convert.
     * @return The corresponding {@link CaseRewardType}, or {@code null} if no match was found.
     */
    public static CaseRewardType fromString(String s) {
        try {
            return CaseRewardType.valueOf(s.toUpperCase());
        } catch (IllegalArgumentException e) {
            return null;
        }
    }
}