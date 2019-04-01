package org.framework.service;

import org.apache.log4j.Logger;

public abstract class AbstractService<T> implements GenericService<T> {
    protected Logger logger = Logger.getLogger(this.getClass().getName());
}
