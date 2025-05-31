# Thread States Diagram and Transitions

## Visual Representation

```
                    Thread Lifecycle State Diagram
                    
    [NEW] ────start()────> [RUNNABLE] ────scheduler────> [RUNNING]
      │                        ▲                           │
      │                        │                           │
      │                   resume/notify                    │
      │                        │                           │
      └──────────────────> [TERMINATED] <─────────────────┤
                               ▲                           │
                               │                           │
                          thread dies                      │
                               │                           │
                               │                           ▼
                    [BLOCKED] ◄─────────────────── wait/block/sleep
                        │                                  │
                        │                                  │
                        └──────> [WAITING] ◄───────────────┘
                                    │
                                    │
                            [TIMED_WAITING]
```

## Thread States Explained

### 1. NEW
- **Description**: Thread object created but not yet started
- **Characteristics**: 
  - Thread exists in memory
  - No system resources allocated yet
  - `start()` method not called
- **Transitions**: NEW → RUNNABLE (via `start()`)

### 2. RUNNABLE
- **Description**: Thread is ready to run and waiting for CPU time
- **Characteristics**:
  - Thread is alive and competing for processor time
  - May be actually running or waiting in ready queue
  - Has all necessary resources except CPU
- **Transitions**: 
  - RUNNABLE → RUNNING (scheduler assigns CPU)
  - RUNNABLE → TERMINATED (thread completes/dies)

### 3. RUNNING
- **Description**: Thread is currently executing on CPU
- **Characteristics**:
  - Thread has CPU time slice
  - Actively executing instructions
  - Only one thread per CPU core can be in this state
- **Transitions**:
  - RUNNING → RUNNABLE (time slice expires, yield(), preemption)
  - RUNNING → BLOCKED (I/O operation, lock acquisition)
  - RUNNING → WAITING (wait(), join(), park())
  - RUNNING → TIMED_WAITING (sleep(), timed wait())
  - RUNNING → TERMINATED (completion, exception, stop())

### 4. BLOCKED
- **Description**: Thread is blocked waiting for a monitor lock
- **Characteristics**:
  - Waiting to acquire synchronized lock
  - Cannot proceed until lock becomes available
  - Specific to synchronization mechanisms
- **Transitions**:
  - BLOCKED → RUNNABLE (acquires lock)
  - BLOCKED → TERMINATED (thread interrupted/killed)

### 5. WAITING
- **Description**: Thread is waiting indefinitely for another thread's action
- **Characteristics**:
  - Waiting for specific condition or signal
  - No timeout specified
  - Common causes: `wait()`, `join()`, `park()`
- **Transitions**:
  - WAITING → RUNNABLE (notify(), notifyAll(), unpark(), join completes)
  - WAITING → TERMINATED (thread interrupted/killed)

### 6. TIMED_WAITING
- **Description**: Thread is waiting for a specified period of time
- **Characteristics**:
  - Has timeout value
  - Will automatically wake up after timeout
  - Common causes: `sleep()`, `wait(timeout)`, `join(timeout)`
- **Transitions**:
  - TIMED_WAITING → RUNNABLE (timeout expires or condition met)
  - TIMED_WAITING → TERMINATED (thread interrupted/killed)

### 7. TERMINATED (DEAD)
- **Description**: Thread has completed execution
- **Characteristics**:
  - Thread's `run()` method completed
  - Cannot be restarted
  - Resources have been cleaned up
- **Transitions**: None (final state)

## State Transition Triggers

### From RUNNING to other states:
- **→ RUNNABLE**: Time slice expires, `yield()`, preemption
- **→ BLOCKED**: Attempting to acquire locked resource
- **→ WAITING**: `wait()`, `join()`, `park()`
- **→ TIMED_WAITING**: `sleep()`, `wait(timeout)`, `join(timeout)`
- **→ TERMINATED**: Method completion, uncaught exception

### From BLOCKED/WAITING/TIMED_WAITING to RUNNABLE:
- **BLOCKED**: Lock becomes available
- **WAITING**: `notify()`, `notifyAll()`, join completion
- **TIMED_WAITING**: Timeout expires or condition met

## Platform-Specific Variations

### Java Thread States (Thread.State enum):
1. NEW
2. RUNNABLE (combines ready and running)
3. BLOCKED
4. WAITING
5. TIMED_WAITING
6. TERMINATED

### POSIX/Unix Thread States:
1. Created
2. Ready
3. Running
4. Blocked
5. Terminated

### Windows Thread States:
1. Initialized
2. Ready
3. Running
4. Standby
5. Waiting
6. Transition
7. Terminated

## Key Points

- **State transitions are atomic**: A thread cannot be in multiple states simultaneously
- **Scheduler control**: OS scheduler determines RUNNABLE → RUNNING transitions
- **Resource dependency**: BLOCKED state specifically for synchronization resources
- **Time-based states**: TIMED_WAITING has built-in timeout mechanism
- **Final state**: TERMINATED is irreversible - thread cannot be restarted
- **Concurrency**: Multiple threads can be in same state (except RUNNING on single-core)

## Common Programming Scenarios

1. **I/O Operations**: RUNNING → BLOCKED → RUNNABLE
2. **Sleep Operations**: RUNNING → TIMED_WAITING → RUNNABLE
3. **Synchronization**: RUNNING → BLOCKED (lock) → RUNNABLE
4. **Inter-thread Communication**: RUNNING → WAITING (notify) → RUNNABLE
5. **Thread Completion**: Any State → TERMINATED