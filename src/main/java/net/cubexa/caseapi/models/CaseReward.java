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

import java.time.Duration;
import java.util.UUID;
import java.util.concurrent.CompletableFuture;

/**
 * Represents a reward within the CaseOpening plugin.
 * <p>
 * Provides access to reward type, chances, availability, item stack, and optional properties
 * such as commands, gems, money, or permissions.
 * <p>
 * This interface should <b>not</b> be implemented manually. It is implemented internally
 * by the CaseOpening system.
 */
public interface CaseReward {

    /**
     * Returns the {@link CaseRewardType} of the reward.
     *
     * @return The {@link CaseRewardType} representing the kind of reward.
     */
    CaseRewardType getType();

    /**
     * Calculates the normalized chance of winning this reward relative to the total chance
     * of all rewards in the case.
     *
     * @param totalChance The sum of base chances of all rewards in the case.
     * @return The normalized win chance as a {@code double}, representing the probability of winning this reward.
     */
    double getWinChance(double totalChance);

    /**
     * Returns the base chance of winning the reward.
     *
     * @return The base chance as a {@code double}.
     */
    double getChance();

    /**
     * Returns the serialized item stack for the reward in Base64 encoding.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#ITEM}.
     *
     * @return The Base64-encoded item stack, or {@code null} if not applicable.
     */
    String getItemStackBase64();

    /**
     * Checks if the reward should trigger a broadcast message when won.
     *
     * @return {@code true} if a broadcast message should be sent; {@code false} otherwise.
     */
    boolean isWithBroadcastMessage();

    /**
     * Returns the index of the reward within its case.
     *
     * @return The zero-based index of the reward.
     */
    int getIndex();

    /**
     * Sets the index of the reward within its case.
     *
     * @param index The new index to assign.
     * @return This {@link CaseReward} instance for chaining.
     */
    CaseReward setIndex(int index);

    /**
     * Checks if the reward has a limited number of draws.
     *
     * @return {@code true} if the reward is limited; {@code false} otherwise.
     */
    boolean isLimited();

    /**
     * Checks whether the reward is currently available to be won.
     *
     * @return {@code true} if available; {@code false} otherwise.
     */
    boolean isAvailable();

    /**
     * Returns the maximum number of times the reward can be drawn.
     *
     * @return The maximum draws allowed, or {@code -1} if unlimited.
     */
    int getMaxDraws();

    /**
     * Returns the remaining number of draws for the reward.
     *
     * @return The remaining draws, {@code 0} if none left, or {@code -1} if the reward is unlimited.
     */
    int getRemainingDraws();

    /**
     * Reduces the remaining draws by one.
     */
    void reduceRemainingDraws();

    /**
     * Returns the amount of gems awarded by the reward.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#GEMS}.
     *
     * @return The gems amount as an {@link Integer}, or {@code null} if not applicable.
     */
    Integer getGemsAmount();

    /**
     * Returns the amount of money awarded by the reward.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#MONEY}.
     *
     * @return The money amount as a {@link Double}, or {@code null} if not applicable.
     */
    Double getMoneyAmount();

    /**
     * Returns the command associated with the reward.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#COMMAND}.
     *
     * @return The command string, or {@code null} if not applicable.
     */
    String getCommand();

    /**
     * Returns the permission granted by the reward.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#PERMISSION}.
     *
     * @return The permission string, or {@code null} if not applicable.
     */
    String getPermission();

    /**
     * Returns the raw duration value specified for this permission reward.
     * <p>
     * For example, if the reward is configured as {@code 12h} (12 hours), this method returns {@code 12}.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#PERMISSION}.
     *
     * @return The numeric duration value as specified in the reward configuration, or {@code null} if not applicable.
     */
    Long getRawPermissionDuration();

    /**
     * Returns the time unit associated with this permission reward's duration.
     * <p>
     * For example, if the reward is configured as {@code 12h} (12 hours), this method returns {@link DurationUnit#HOURS}.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#PERMISSION}.
     *
     * @return The {@link DurationUnit} corresponding to the configured duration, or {@code null} if not applicable.
     */
    DurationUnit getPermissionDurationUnit();

    /**
     * Returns the duration for which the permission granted by the reward is valid.
     * <p>
     * Only applicable if {@link #getType()} is {@link CaseRewardType#PERMISSION}.
     *
     * @return The {@link Duration} of the permission, or {@code null} if not applicable.
     */
    Duration getPermissionDuration();

    /**
     * Applies this reward to the specified player.
     * <p>
     * Each reward type provides its own implementation.
     * This method should <b>not</b> be called directly on manually created instances.
     *
     * @param playerUuid The UUID of the player to receive the reward.
     * @param crate The {@link Case} from which the player has drawn the reward.
     * @return A {@link CompletableFuture} holding {@code true} if the process was successful; {@code false} otherwise.
     * @throws UnsupportedOperationException If called on a {@code CaseReward} without a specific type.
     */
    CompletableFuture<Boolean> apply(UUID playerUuid, Case crate);
}