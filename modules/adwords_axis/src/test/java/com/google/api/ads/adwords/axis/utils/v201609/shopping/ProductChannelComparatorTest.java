// Copyright 2016 Google Inc. All Rights Reserved.
//
// Licensed under the Apache License, Version 2.0 (the "License");
// you may not use this file except in compliance with the License.
// You may obtain a copy of the License at
//
// http://www.apache.org/licenses/LICENSE-2.0
//
// Unless required by applicable law or agreed to in writing, software
// distributed under the License is distributed on an "AS IS" BASIS,
// WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
// See the License for the specific language governing permissions and
// limitations under the License.

package com.google.api.ads.adwords.axis.utils.v201609.shopping;

import com.google.api.ads.adwords.axis.v201609.cm.ProductChannel;
import com.google.api.ads.adwords.axis.v201609.cm.ShoppingProductChannel;
import com.google.common.collect.Lists;
import java.util.List;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

/**
 * Tests for comparing {@link ProductChannel} dimensions.
 */
@RunWith(JUnit4.class)
public class ProductChannelComparatorTest extends BaseProductDimensionComparatorTest {

  @Override
  ProductChannel createOtherProductDimension() {
    ProductChannel channel = new ProductChannel();
    return channel;
  }
  
  @Override
  List<ProductChannel> createNonOtherProductDimensions() {
    return Lists.newArrayList(
        ProductDimensions.createChannel(ShoppingProductChannel.LOCAL),
        ProductDimensions.createChannel(ShoppingProductChannel.ONLINE));
  }
}