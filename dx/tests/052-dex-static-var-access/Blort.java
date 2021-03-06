/*
 * Copyright (C) 2007 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

public class Blort 
{
    public static boolean staticBoolean;
    public static byte staticByte;
    public static char staticChar;
    public static short staticShort;
    public static int staticInt;
    public static long staticLong;
    public static float staticFloat;
    public static double staticDouble;
    public static Object staticObject;

    public static Object test1() {
        int x = staticByte + staticChar + staticShort + staticInt +
            (int) staticLong + (int) staticFloat + (int) staticDouble;

        if (staticBoolean && (x > 0)) {;
            return staticObject;
        } else {
            return null;
        }
    }

    public static void test2(boolean b, int i, Object o) {
        staticBoolean = b;
        staticByte = (byte) i;
        staticChar = (char) i;
        staticShort = (short) i;
        staticInt = i;
        staticLong = i;
        staticFloat = i;
        staticDouble = i;
        staticObject = o;
    }
}
