/*******************************************************************************
 * Copyright (c) 2014 eBay Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *******************************************************************************/
package org.ostara.cmd;

public abstract class BaseCommand implements ICommand {
   private String m_name;

   private ICmdMeta m_meta;

   private ICmdCtx m_ctx;

   public BaseCommand(String name) {
      if (name == null) {
         throw new IllegalArgumentException("Name can't be null!");
      }

      m_name = name;
      m_meta = CmdRegistry.getInstance().getCmdMeta(getClass());
   }

   protected ICmdCtx getCtx() {
      return m_ctx;
   }

   @Override
   public ICmdMeta getMeta() {
      return m_meta;
   }

   public String getName() {
      return m_name;
   }

   public void setCtx(ICmdCtx ctx) {
      m_ctx = ctx;
   }

   @Override
   public String toString() {
      return "BaseCommand [m_name=" + m_name + "]";
   }

}
