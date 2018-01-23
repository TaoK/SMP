/*
 * SicMu Player - Lightweight music player for Android
 * Copyright (C) 2017  Mathieu Souchaud
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package souch.smp;

public enum RepeatMode {
    REPEAT_ALL(0),
    REPEAT_TOP(1),
    REPEAT_2ND(2),
    REPEAT_3RD(3),
    REPEAT_4TH(4),
    REPEAT_ONE(Constants.LEVEL_INDIVIDUAL),
    REPEAT_GROUP(Constants.LEVEL_LEAF);

    private final int level;
    int getLevel() {
        return level;
    }

    RepeatMode(int level) {
        this.level = level;
    }

    public static class Constants {
        public static final int LEVEL_LEAF = -1;
        public static final int LEVEL_INDIVIDUAL = 99;
    }
}
