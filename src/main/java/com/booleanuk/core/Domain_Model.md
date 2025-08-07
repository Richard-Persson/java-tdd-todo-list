
| Classes  | Methods                                     | Scenario                                        | Outputs                            |
| -------- | ------------------------------------------- | ----------------------------------------------- | ---------------------------------- |
| TodoList | boolean addTask(Task task)                  | task is valid                                   | true                               |
|          |                                             | task is empty object                            | false                              |
|          |                                             | task is null                                    | false                              |
| TodoList | List\<Tasks\> getAllTasks()                 | one or more tasks exists                        | List\<Task\>                       |
|          |                                             | less than one task exists                       | null                               |
| Task     | void changeStatus(String status)            | Task exists                                     | task with new status               |
|          |                                             | Task dosent exist                               |                                    |
| ToDoList | List\<Tasks\> getAllincompleteTasks()       | all task are incomplete                         | List of incomplete tasks           |
|          |                                             | one or more tasks are not incomplete            | null                               |
| ToDoList | List<\Tasks\> getAllCompleteTasks()         | all tasks are complete                          | List of complete tasks             |
|          |                                             | one or more tasks are not complete              | null                               |
| ToDoList | String searchTask(String taskName)          | task is found                                   | String  that says task is found    |
|          |                                             | task is not found                               | String that says task is not found |
|          |                                             | String is null                                  | String that says error with search |
| TodoList | boolean removeTask(int numer)               | tasks exists in todo-list                       | true                               |
|          |                                             | task does not exist                             | false                              |
| TodoList | List\<Tasks\> ascendingAlphabeticalOrder()  | tasks are ordered alphabetically and ascending  | Correct List                       |
|          |                                             | tasks are not ordered                           | null                               |
|          |                                             | tasks are not aplhabetical                      | null                               |
| TodoList | List\<Tasks\> descendingAlphabeticalOrder() | tasks are ordered alphabetically and descending | Correct List                       |
|          |                                             | tasks are not alphabetical                      | null                               |
|          |                                             | tasks are not descending                        | null                               |
|          |                                             |                                                 |                                    |
|          |                                             |                                                 |                                    |
|          |                                             |                                                 |                                    |
