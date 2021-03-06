/*
 * Copyright (c) 2016 Martin Pfeffer
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

package com.pepperonas.yahama.app.model.entity;

/**
 * Created by martin on 10.08.2015.
 */
public abstract class SurroundEntity extends BaseEntity {


    private int dspLvl = -2;
    private int initDly = 50;
    private int roomSize = 5;
    private int surInitDly = 5;
    private int surRoomSize = 30;
    private int surBackInitDly = 125;
    private int surBackRoomSize = 5;


    public int getDspLvl() {
        return dspLvl;
    }


    public void setDspLvl(int dspLvl) {
        this.dspLvl = dspLvl;
    }


    public int getInitDly() {
        return initDly;
    }


    public void setInitDly(int initDly) {
        this.initDly = initDly;
    }


    public int getRoomSize() {
        return roomSize;
    }


    public void setRoomSize(int roomSize) {
        this.roomSize = roomSize;
    }


    public int getSurInitDly() {
        return surInitDly;
    }


    public void setSurInitDly(int surInitDly) {
        this.surInitDly = surInitDly;
    }


    public int getSurRoomSize() {
        return surRoomSize;
    }


    public void setSurRoomSize(int surRoomSize) {
        this.surRoomSize = surRoomSize;
    }


    public int getSurBackInitDly() {
        return surBackInitDly;
    }


    public void setSurBackInitDly(int surBackInitDly) {
        this.surBackInitDly = surBackInitDly;
    }


    public int getSurBackRoomSize() {
        return surBackRoomSize;
    }


    public void setSurBackRoomSize(int surBackRoomSize) {
        this.surBackRoomSize = surBackRoomSize;
    }
}
