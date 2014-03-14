/*
 * Copyright 2014 Splunk, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"): you may
 * not use this file except in compliance with the License. You may obtain
 * a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */
package com.splunk;

public enum NumberComparison {
    EQUALS {
        public String toString() { return "="; }
    },
    NOT_EQUALS {
        public String toString() { return "!="; }
    },
    LESS_THAN {
        public String toString() { return "<"; }
    },
    AT_MOST {
        public String toString() { return "<="; }
    },
    GREATHER_THAN {
        public String toString() { return ">"; }
    },
    AT_LEAST {
        public String toString() { return ">="; }
    },
    IS_NULL {
        public String toString() { return "isNull"; }
    },
    IS_NOT_NULL {
        public String toString() { return "isNotNull"; }
    }
}
