-- https://www.hackerrank.com/challenges/challenges/problem?isFullScreen=true

WITH challenge_counts AS (
    SELECT h.hacker_id, h.name, COUNT(c.challenge_id) AS cnt
    FROM Hackers h
    JOIN Challenges c
    ON h.hacker_id = c.hacker_id
    GROUP BY h.hacker_id, h.name
),
max_count AS (
    SELECT MAX(cnt) AS max_cnt
    FROM challenge_counts
),
duplicate_counts AS (
    SELECT cnt
    FROM challenge_counts
    GROUP BY cnt
    HAVING COUNT(*) > 1
)

SELECT hacker_id, name, cnt
FROM challenge_counts
WHERE
    cnt = (SELECT max_cnt FROM max_count)
    OR cnt NOT IN (SELECT cnt FROM duplicate_counts)
ORDER BY
    cnt DESC,
    hacker_id;