/*
 * Copyright (c) Meta Platforms, Inc. and affiliates.
 *
 * This source code is licensed under the MIT license found in the
 * LICENSE file in the root directory of this source tree.
 */

package com.facebook.callercontext;

import com.facebook.infer.annotation.Nullsafe;
import javax.annotation.Nullable;

/** Verifies CallerContext */
@Nullsafe(Nullsafe.Mode.STRICT)
public interface CallerContextVerifier {

  void verifyCallerContext(@Nullable Object callerContext, boolean isPrefetch);
}
