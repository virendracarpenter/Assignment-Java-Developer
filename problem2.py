import csv

# Open employees.csv file for reading
with open('employees.csv', 'r') as f:

  # Open managers.csv file for writing
  with open('managers.csv', 'w') as managers_file:

    # Create CSV writer object for managers.csv file
    managers_writer = csv.writer(managers_file)

    # Open single_name_employees.csv file for writing
    with open('single_name_employees.csv', 'w') as single_name_file:

      # Create CSV writer object for single_name_employees.csv file
      single_name_writer = csv.writer(single_name_file)

      # Create CSV reader object for employees.csv file
      reader = csv.reader(f)

      # Loop over each row in employees.csv
      for row in reader:

        # Check if the role is 'Manager' and division is 'R&D'
        if row[1] == 'Manager' and row[2] == 'R&D':

          # Write the row to managers.csv file
          managers_writer.writerow(row)

        # Check if the name has only one part (no last name)
        elif len(row[0].split()) == 1:

          # Write the row to single_name_employees.csv file
          single_name_writer.writerow(row)
