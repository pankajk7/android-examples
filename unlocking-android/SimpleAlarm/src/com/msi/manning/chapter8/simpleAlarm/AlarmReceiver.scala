/*
 * Copyright (C) 2009 Manning Publications Co.
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

package com.msi.manning.chapter8.simplealarm

import android.content.BroadcastReceiver
import android.content.{Context, Intent}
import android.widget.Toast

class AlarmReceiver extends BroadcastReceiver {

  def onReceiveIntent(context: Context, intent: Intent) {
    Toast.makeText(context, R.string.app_name, Toast.LENGTH_SHORT).show()
  }

  override def onReceive(context: Context, intent: Intent) {
  }
}
