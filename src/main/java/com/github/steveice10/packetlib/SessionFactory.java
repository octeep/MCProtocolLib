package com.github.steveice10.packetlib;

/**
 * A factory for creating sessions.
 */
public interface SessionFactory {
    /**
     * Creates a client session.
     *
     * @param client Client to create the session for.
     * @return The created session.
     */
    public Session createClientSession(Client client);
}
