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
package com.amazonaws.services.chime.model;

import java.io.Serializable;
import javax.annotation.Generated;

import com.amazonaws.AmazonWebServiceRequest;

/**
 * 
 * @see <a href="http://docs.aws.amazon.com/goto/WebAPI/chime-2018-05-01/RedactConversationMessage" target="_top">AWS
 *      API Documentation</a>
 */
@Generated("com.amazonaws:aws-java-sdk-code-generator")
public class RedactConversationMessageRequest extends com.amazonaws.AmazonWebServiceRequest implements Serializable, Cloneable {

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     */
    private String accountId;
    /**
     * <p>
     * The conversation ID.
     * </p>
     */
    private String conversationId;
    /**
     * <p>
     * The message ID.
     * </p>
     */
    private String messageId;

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     */

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @return The Amazon Chime account ID.
     */

    public String getAccountId() {
        return this.accountId;
    }

    /**
     * <p>
     * The Amazon Chime account ID.
     * </p>
     * 
     * @param accountId
     *        The Amazon Chime account ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactConversationMessageRequest withAccountId(String accountId) {
        setAccountId(accountId);
        return this;
    }

    /**
     * <p>
     * The conversation ID.
     * </p>
     * 
     * @param conversationId
     *        The conversation ID.
     */

    public void setConversationId(String conversationId) {
        this.conversationId = conversationId;
    }

    /**
     * <p>
     * The conversation ID.
     * </p>
     * 
     * @return The conversation ID.
     */

    public String getConversationId() {
        return this.conversationId;
    }

    /**
     * <p>
     * The conversation ID.
     * </p>
     * 
     * @param conversationId
     *        The conversation ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactConversationMessageRequest withConversationId(String conversationId) {
        setConversationId(conversationId);
        return this;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @param messageId
     *        The message ID.
     */

    public void setMessageId(String messageId) {
        this.messageId = messageId;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @return The message ID.
     */

    public String getMessageId() {
        return this.messageId;
    }

    /**
     * <p>
     * The message ID.
     * </p>
     * 
     * @param messageId
     *        The message ID.
     * @return Returns a reference to this object so that method calls can be chained together.
     */

    public RedactConversationMessageRequest withMessageId(String messageId) {
        setMessageId(messageId);
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
        if (getAccountId() != null)
            sb.append("AccountId: ").append(getAccountId()).append(",");
        if (getConversationId() != null)
            sb.append("ConversationId: ").append(getConversationId()).append(",");
        if (getMessageId() != null)
            sb.append("MessageId: ").append(getMessageId());
        sb.append("}");
        return sb.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;

        if (obj instanceof RedactConversationMessageRequest == false)
            return false;
        RedactConversationMessageRequest other = (RedactConversationMessageRequest) obj;
        if (other.getAccountId() == null ^ this.getAccountId() == null)
            return false;
        if (other.getAccountId() != null && other.getAccountId().equals(this.getAccountId()) == false)
            return false;
        if (other.getConversationId() == null ^ this.getConversationId() == null)
            return false;
        if (other.getConversationId() != null && other.getConversationId().equals(this.getConversationId()) == false)
            return false;
        if (other.getMessageId() == null ^ this.getMessageId() == null)
            return false;
        if (other.getMessageId() != null && other.getMessageId().equals(this.getMessageId()) == false)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int hashCode = 1;

        hashCode = prime * hashCode + ((getAccountId() == null) ? 0 : getAccountId().hashCode());
        hashCode = prime * hashCode + ((getConversationId() == null) ? 0 : getConversationId().hashCode());
        hashCode = prime * hashCode + ((getMessageId() == null) ? 0 : getMessageId().hashCode());
        return hashCode;
    }

    @Override
    public RedactConversationMessageRequest clone() {
        return (RedactConversationMessageRequest) super.clone();
    }

}
