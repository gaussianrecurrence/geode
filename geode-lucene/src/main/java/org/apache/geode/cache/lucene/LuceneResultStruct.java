/*
 * Licensed to the Apache Software Foundation (ASF) under one or more contributor license
 * agreements. See the NOTICE file distributed with this work for additional information regarding
 * copyright ownership. The ASF licenses this file to You under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance with the License. You may obtain a
 * copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
package org.apache.geode.cache.lucene;

import java.io.Serializable;

import org.apache.geode.annotations.Experimental;

/**
 * A single result of a Lucene query.
 * 
 */
@Experimental
public interface LuceneResultStruct<K, V> extends Serializable {

  /**
   * @return The region key of the entry matching the query
   *
   */
  public K getKey();

  /**
   * @return the region value of the entry matching the query.
   *
   */
  public V getValue();

  /**
   * Return score the score of the entry matching the query. Scores are computed by Lucene based on
   * how closely documents match the query. See {@link org.apache.lucene.search} for details on how
   * scores are computed.
   *
   */
  public float getScore();
}

