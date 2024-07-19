package me.jass.api;

import org.bukkit.event.Cancellable;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class SneakEvent extends Event implements Cancellable {
    private static HandlerList handlers;
    private boolean cancelled;
    private boolean sneaking;

    public SneakEvent(boolean sneaking) {
        this.sneaking = sneaking;
        handlers = new HandlerList();
        cancelled = false;
    }

    public boolean isSneaking() {
        return sneaking;
    }

    @Override
    public boolean isCancelled() {
        return cancelled;
    }

    @Override
    public void setCancelled(boolean cancelled) {
        this.cancelled = cancelled;
    }

    @Override
    public HandlerList getHandlers() {
        return handlers;
    }

    public static HandlerList getHandlerList() {
        return handlers;
    }
}
