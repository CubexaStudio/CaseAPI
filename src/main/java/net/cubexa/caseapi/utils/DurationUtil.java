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
package net.cubexa.caseapi.utils;

import net.cubexa.caseapi.models.DurationUnit;

import java.time.Duration;

/**
 * Utility class for converting between a numeric time amount and a {@link Duration}
 * using a custom {@link DurationUnit}.
 * <p>
 * This class provides convenient methods for creating {@link Duration} instances
 * based on predefined time units.
 */
public class DurationUtil {

    /**
     * Converts the specified amount and {@link DurationUnit} to a {@link Duration}.
     * <p>
     * If the provided unit is {@code null} or unsupported, this method returns {@link Duration#ZERO}.
     *
     * @param amount The numeric time amount to convert.
     * @param unit The unit corresponding to the given amount.
     * @return A {@link Duration} representing the specified time span, or {@link Duration#ZERO} if the unit is {@code null} or unknown.
     */
    public static Duration getDuration(long amount, DurationUnit unit) {
        if (unit == null) return Duration.ZERO;
        return switch (unit) {
            case SECONDS -> Duration.ofSeconds(amount);
            case MINUTES -> Duration.ofMinutes(amount);
            case HOURS -> Duration.ofHours(amount);
            case DAYS -> Duration.ofDays(amount);
            case WEEKS -> Duration.ofDays(amount * 7);
            case MONTHS -> Duration.ofDays(amount * 30);
            case YEARS -> Duration.ofDays(amount * 365);
            default -> Duration.ZERO;
        };
    }
}