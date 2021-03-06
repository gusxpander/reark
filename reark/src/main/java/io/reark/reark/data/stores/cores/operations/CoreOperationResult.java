/*
 * The MIT License
 *
 * Copyright (c) 2013-2017 reark project contributors
 *
 * https://github.com/reark/reark/graphs/contributors
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package io.reark.reark.data.stores.cores.operations;

import android.content.ContentProviderResult;
import android.net.Uri;
import android.support.annotation.NonNull;

public final class CoreOperationResult {

    private final int id;

    @NonNull
    private final Uri uri;

    private final boolean success;

    public CoreOperationResult(@NonNull CoreOperation operation, boolean success) {
        this.id = operation.id();
        this.uri = operation.uri();
        this.success = success;
    }

    public CoreOperationResult(@NonNull ContentProviderResult result, @NonNull CoreOperation operation) {
        this.id = operation.id();
        this.uri = operation.uri();
        this.success = result.count == null || result.count > 0;
    }

    public int id() {
        return id;
    }

    @NonNull
    public Uri uri() {
        return uri;
    }

    public boolean success() {
        return success;
    }

}
