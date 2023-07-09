// Copyright 2020 Goldman Sachs
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
//      http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package org.finos.legend.engine.store.core;

import org.finos.legend.authentication.intermediationrule.IntermediationRuleProvider;

import java.util.Optional;

// TODO - Should "test" interfaces be merged into "core" interfaces ?
public interface LegendStoreTestConnectionProvider<T>
{
    void initializeForTest() throws Exception;

    void shutdownForTest() throws Exception;

    T getConnection() throws Exception;

    void configureConnection(T connection) throws Exception;

    Optional<IntermediationRuleProvider> getIntermediationRuleProvider() throws Exception;
}
