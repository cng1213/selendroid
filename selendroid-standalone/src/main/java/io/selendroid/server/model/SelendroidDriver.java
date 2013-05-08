/*
 * Copyright 2013 selendroid committers.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package io.selendroid.server.model;

import io.selendroid.android.AndroidApp;
import io.selendroid.android.AndroidDevice;

import org.openqa.selendroid.server.Versionable;


public class SelendroidDriver implements Versionable {
  private AndroidApp appUnderTest;
  private AndroidDevice device;


  @Override
  public String getServerVersion() {
    String version = "dev";
    // TODO ddary read version number from jar
    return version;
  }

  @Override
  public String getCpuArch() {
    // TODO Auto-generated method stub
    return null;
  }

  @Override
  public String getOsVersion() {
    // TODO Auto-generated method stub
    return null;
  }


}