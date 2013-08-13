/*
 * This file is part of onLotto.
 *
 * Copyright © 2011-2013 Visual Illusions Entertainment
 *
 * onLotto is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License,
 * or (at your option) any later version.
 *
 * onLotto is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 * without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.
 * See the GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License along with onLotto.
 * If not, see http://www.gnu.org/licenses/gpl.html.
 */
package net.visualillusionsent.onlotto;

import net.canarymod.api.inventory.Item;

public final class WeightedItem {

    private final Item item;
    private final double weight;

    public WeightedItem(Item item, double weight) {
        this.item = item;
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public Item getItem() {
        return item.clone();
    }
}
