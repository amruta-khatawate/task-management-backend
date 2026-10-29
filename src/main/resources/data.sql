INSERT INTO task
(title, description, category, priority, duedate, status, created_at, completed_at)
VALUES
    ('Complete Angular Assignment',
     'Finish the task manager application with all requirements including http integration',
     'Education', 'High', '2030-12-15', 'In-Progress', '2023-12-01', NULL),

    ('Buy Groceries',
     'Milk, Bread, vegetable, fruits',
     'Shopping', 'Medium', '2030-12-10', 'Pending', '2030-12-05', NULL),

    ('Team Meeting',
     'Discuss Q1 project roadmap and assign responsibities',
     'Work', 'High', '2030-12-18', 'Completed', '2030-12-03', '2030-12-08'),

    ('Morning Jog',
     '30 mins jogging in the park',
     'Health', 'Low', '2030-12-09', 'Pending', '2030-12-04', NULL),

    ('Pay Electricity Bill',
     'Pay the monthly electricity bill before due date',
     'Finance', 'High', '2030-12-12', 'Pending', '2030-12-02', NULL),

    ('Read JavaScript Book',
     'Complete chapters 5-8 Eloquent JavaScript',
     'Education', 'Medium', '2030-12-20', 'In-Progress', '2030-12-01', NULL),

    ('Birthday Gift for Mom',
     'Buy a nice gift for mom''s birthday neaxt week',
     'Personal', 'High', '2030-12-14', 'Pending', '2030-12-05', NULL),

    ('Fix Kitchen Tap',
     'The kitchen tap is leaking, need to call a plumber or fix it',
     'Other', 'Medium', '2030-12-11', 'Pending', '2030-12-06', NULL);