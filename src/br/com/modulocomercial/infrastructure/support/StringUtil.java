/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.modulocomercial.infrastructure.support;

/**
 *
 * @author Pedro Henrique
 */
public class StringUtil {
    /**
     * Represents the singleton instance of the class.
     */
    private static StringUtil instance;

    /**
     * Object monitor for synchronize.
     */
    private static final Object MONITOR = new Object();

    /**
     * Create a new instance of the class.
     */
    private StringUtil() {
        super();
    }

    /**
     * Instantiates a new {@link StringUtil}.
     * 
     * @return the instance.
     */
    public static StringUtil getInstance() {
        synchronized (MONITOR) {
            if (instance == null) {
                instance = new StringUtil();
            }
        }
        return instance;
    }

    /**
     * Validate if an string is <code>null</code>.
     * 
     * @param str a string to validate
     * @return <code>true</code> if is null.
     */
    public boolean isNull(final String str) {
        return (str == null);
    }

    /**
     * Validate if a string is null and empty. If is null immediately return <code>true</code>
     * otherwise test if is empty.
     * 
     * @param str a string to validate.
     * @return <code>true</code> if is null and empty.
     */
    public boolean isEmpty(final String str) {
        return (isNull(str) ? true : (str.trim().equals("")));
    }

    /**
     * Validate if a string is null and empty.
     * 
     * @param str the string to validate.
     * @return <code>true</code> if the string is null and empty.
     */
    public boolean isNullAndEmpty(final String str) {
        return (isNull(str) && isEmpty(str));
    }

    /**
     * Validate if a string is null or empty.
     * 
     * @param str the string to validate.
     * @return <code>true</code> if is null or empty.
     */
    public boolean isNullOrEmpty(final String str) {
        return (isNull(str) || isEmpty(str));
    }
}