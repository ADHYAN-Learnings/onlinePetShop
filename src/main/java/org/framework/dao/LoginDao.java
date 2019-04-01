/** @Author AdityaPandey
 *  15 May 2018
 */
package org.framework.dao;

public interface LoginDao<T> {
  public T getUserLoginInfo(String username);
}
