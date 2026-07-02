# kotoba-lang/model-checking

Zero-dep portable `.cljc` — restored from the legacy `kami-engine/kami-verify`
Rust crate (deleted in kotoba-lang/kami-engine PR #82 "Remove Rust workspace
from kami-engine") as part of the **clj-wgsl migration** (ADR-2607010930,
`com-junkawasaki/root`).

KAMI Verify: formal verification (equivalence checking, model checking,
SVA assertions) and coverage analysis for digital designs.

**Named `model-checking`, not `verify`** — `verify` is a generic verb
with high future collision risk in a large, actively-developed org, same
class of correction as `kami-si` -> `signal-integrity`.

## Status

Scaffold only — the CLJC restoration is pending.

## Develop

```bash
clojure -M:test
```
