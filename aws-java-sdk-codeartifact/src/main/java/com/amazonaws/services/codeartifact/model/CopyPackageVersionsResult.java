/*
 * Copyright 2015-2020 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"). You may not use this file except in compliance with
 * the License. A copy of the License is located at
 * 
 * http://aws.amazon.com/apache2.0
 * 
 * or in the "license" file accompanying this file. This file is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR
 * CONDITIONS OF ANY KIND, either express or implied. See the License for the specific language governing permissions
 * and limitations under the License.
 */
package com.amazonaws.services.codeartifact.model;

import java.io.Serializable;
import javax.annotation.Generated;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/codeartifact-2018-09-22/CopyPackageVersions" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class CopyPackageVersionsResult extends com.amazonaws.AmazonWebServiceResult<com.amazonaws.ResponseMetadata> implements Serializable, Cloneable {

    /**
     * <p>
     * A list of the package versions that were successfully copied to your repository.
     * </p>
     */
    private java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions;
    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The possible error codes are in the
     * <code>PackageVersionError</code> data type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     */
    private java.util.Map<String, PackageVersionError> failedVersions;

    /**
     * <p>
     * A list of the package versions that were successfully copied to your repository.
     * </p>
     * 
     * @return A list of the package versions that were successfully copied to your repository.
     */

    public java.util.Map<String, SuccessfulPackageVersionInfo> getSuccessfulVersions() {
        return successfulVersions;
    }

    /**
     * <p>
     * A list of the package versions that were successfully copied to your repository.
     * </p>
     * 
     * @param successfulVersions
     *        A list of the package versions that were successfully copied to your repository.
     */

    public void setSuccessfulVersions(java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        this.successfulVersions = successfulVersions;
    }

    /**
     * <p>
     * A list of the package versions that were successfully copied to your repository.
     * </p>
     * 
     * @param successfulVersions
     *        A list of the package versions that were successfully copied to your repository.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsResult withSuccessfulVersions(java.util.Map<String, SuccessfulPackageVersionInfo> successfulVersions) {
        setSuccessfulVersions(successfulVersions);
        return this;
    }

    /**
     * Add a single SuccessfulVersions entry
     *
     * @see CopyPackageVersionsResult#withSuccessfulVersions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsResult addSuccessfulVersionsEntry(String key, SuccessfulPackageVersionInfo value) {
        if (null == this.successfulVersions) {
            this.successfulVersions = new java.util.HashMap<String, SuccessfulPackageVersionInfo>();
        }
        if (this.successfulVersions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.successfulVersions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into SuccessfulVersions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsResult clearSuccessfulVersionsEntries() {
        this.successfulVersions = null;
        return this;
    }

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The possible error codes are in the
     * <code>PackageVersionError</code> data type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @return A map of package versions that failed to copy and their error codes. The possible error codes are in the
     *         <code>PackageVersionError</code> data type. They are: </p>
     *         <ul>
     *         <li>
     *         <p>
     *         <code>ALREADY_EXISTS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_REVISION</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>MISMATCHED_STATUS</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_ALLOWED</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>NOT_FOUND</code>
     *         </p>
     *         </li>
     *         <li>
     *         <p>
     *         <code>SKIPPED</code>
     *         </p>
     *         </li>
     */

    public java.util.Map<String, PackageVersionError> getFailedVersions() {
        return failedVersions;
    }

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The possible error codes are in the
     * <code>PackageVersionError</code> data type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failedVersions
     *        A map of package versions that failed to copy and their error codes. The possible error codes are in the
     *        <code>PackageVersionError</code> data type. They are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALREADY_EXISTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_REVISION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_STATUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_ALLOWED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FOUND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>
     *        </p>
     *        </li>
     */

    public void setFailedVersions(java.util.Map<String, PackageVersionError> failedVersions) {
        this.failedVersions = failedVersions;
    }

    /**
     * <p>
     * A map of package versions that failed to copy and their error codes. The possible error codes are in the
     * <code>PackageVersionError</code> data type. They are:
     * </p>
     * <ul>
     * <li>
     * <p>
     * <code>ALREADY_EXISTS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_REVISION</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>MISMATCHED_STATUS</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_ALLOWED</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>NOT_FOUND</code>
     * </p>
     * </li>
     * <li>
     * <p>
     * <code>SKIPPED</code>
     * </p>
     * </li>
     * </ul>
     * 
     * @param failedVersions
     *        A map of package versions that failed to copy and their error codes. The possible error codes are in the
     *        <code>PackageVersionError</code> data type. They are: </p>
     *        <ul>
     *        <li>
     *        <p>
     *        <code>ALREADY_EXISTS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_REVISION</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>MISMATCHED_STATUS</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_ALLOWED</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>NOT_FOUND</code>
     *        </p>
     *        </li>
     *        <li>
     *        <p>
     *        <code>SKIPPED</code>
     *        </p>
     *        </li>
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsResult withFailedVersions(java.util.Map<String, PackageVersionError> failedVersions) {
        setFailedVersions(failedVersions);
        return this;
    }

    /**
     * Add a single FailedVersions entry
     *
     * @see CopyPackageVersionsResult#withFailedVersions
     * @returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsResult addFailedVersionsEntry(String key, PackageVersionError value) {
        if (null == this.failedVersions) {
            this.failedVersions = new java.util.HashMap<String, PackageVersionError>();
        }
        if (this.failedVersions.containsKey(key))
            throw new IllegalArgumentException("Duplicated keys (" + key.toString() + ") are provided.");
        this.failedVersions.put(key, value);
        return this;
    }

    /**
     * Removes all the entries added into FailedVersions.
     *
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public CopyPackageVersionsResult clearFailedVersionsEntries() {
        this.failedVersions = null;
        return this;
    }

    /**
     * Returns a string representation of this object. This is useful for testing and debugging. Sensitive data will be
     * redacted from this string using a placeholder value.
     *
     * @return A string representation of this object.
     *
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{");
        if (getSuccessfulVersions() != null)
            sb.append("SuccessfulVersions: ").append(getSuccessfulVersions()).append(",");
        if (getFailedVersions() != null)
            sb.append("FailedVersions: ").append(getFailedVersions());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof CopyPackageVersionsResult == false)
            return false;
        CopyPackageVersionsResult other = (CopyPackageVersionsResult) obj;
        if (other.getSuccessfulVersions() == null ^ this.getSuccessfulVersions() == null)
            return false;
        if (other.getSuccessfulVersions() != null && other.getSuccessfulVersions().equals(this.getSuccessfulVersions()) == false)
            return false;
        if (other.getFailedVersions() == null ^ this.getFailedVersions() == null)
            return false;
        if (other.getFailedVersions() != null && other.getFailedVersions().equals(this.getFailedVersions()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getSuccessfulVersions() == null) ? 0 : getSuccessfulVersions().hashCode());
        hashCode = prime * hashCode + ((getFailedVersions() == null) ? 0 : getFailedVersions().hashCode());
        return hashCode;
    }

    @Override
    public CopyPackageVersionsResult clone() {
        try {
            return (CopyPackageVersionsResult) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException("Got a CloneNotSupportedException from Object.clone() " + "even though we're Cloneable!", e);
        }
    }

}
